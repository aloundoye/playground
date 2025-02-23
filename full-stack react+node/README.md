# 🚀 Full-Stack Project with Hexagonal Architecture

## 🏗️ Tech Stack
### **Frontend**
- **React** (Component-based UI library)
- **Vite** (Fast build tool for frontend development)
- **TypeScript** (Type-safe JavaScript)
- **React Query** (Data fetching & caching)
- **Zustand / Redux** (State management)
- **Vitest + React Testing Library** (Unit & component testing)

### **Backend**
- **Node.js** (JavaScript runtime)
- **Fastify** (High-performance web framework)
- **TypeScript** (Static typing for better maintainability)
- **Prisma** (Type-safe ORM for PostgreSQL)
- **PostgreSQL** (Relational database)
- **Vitest** (Unit and integration testing)

### **Additional Tools**
- **Docker** (Containerization)
- **Redis** (Caching and background jobs, optional)
- **BullMQ** (Message queue for background jobs, optional)
- **Playwright / Cypress** (End-to-end testing)

---

## 📂 Project Structure (Hexagonal Architecture)

```
/project-root
│── /backend                # Backend (Fastify, Prisma, PostgreSQL)
│   ├── /src
│   │   ├── /app            # Core Business Logic
│   │   │   ├── /services   # Use Cases & Domain Logic
│   │   │   ├── /ports      # Interfaces for Repositories & APIs
│   │   │   ├── /entities   # Domain Models
│   │   │   ├── /errors     # Custom Error Handling
│   │   ├── /adapters       # Infrastructure Adapters (DB, HTTP, etc.)
│   │   │   ├── /database   # Prisma ORM
│   │   │   ├── /http       # Fastify API Controllers
│   │   │   ├── /cache      # Redis Integration (Optional)
│   │   │   ├── /queue      # Background Jobs (BullMQ)
│   │   ├── /config         # Environment Configuration
│   │   ├── /tests          # Unit & Integration Tests (Vitest)
│   │   ├── /server.ts      # Fastify Server Entry Point
│   ├── package.json
│   ├── prisma/schema.prisma
│── /frontend               # Frontend (React, Vite, TypeScript)
│   ├── /src
│   │   ├── /components     # UI Components
│   │   ├── /features       # Feature Modules
│   │   ├── /hooks          # Custom React Hooks
│   │   ├── /services       # API Calls (Axios/React Query)
│   │   ├── /store          # State Management (Zustand/Redux)
│   │   ├── /pages          # Page Routing
│   │   ├── /tests          # Unit & Component Tests (Vitest)
│   ├── package.json
│   ├── vite.config.ts
│── /docker                 # Docker Configurations
│── .env                    # Environment Variables
│── README.md
```

---

## ⚡ Hexagonal Architecture Explained

### 🟢 **1. Core Domain (Business Logic)**
Located in `backend/src/app/`, contains:
- `services/` → Business logic (use cases, e.g., `UserService.ts`)
- `entities/` → Pure domain models (e.g., `User.ts`)
- `ports/` → Interfaces for repositories and services

📌 **Example Port (Interface for User Repository):**
```ts
// src/app/ports/UserRepository.ts
export interface UserRepository {
  findById(id: string): Promise<User | null>;
  create(user: User): Promise<User>;
}
```

📌 **Example Service (Business Logic):**
```ts
// src/app/services/UserService.ts
import { UserRepository } from "../ports/UserRepository";

export class UserService {
  constructor(private userRepo: UserRepository) {}

  async getUser(id: string) {
    return this.userRepo.findById(id);
  }
}
```

---

### 🟡 **2. Infrastructure (Adapters)**
Located in `backend/src/adapters/`, contains:
- **Database (Prisma ORM)**
- **HTTP Controllers (Fastify)**
- **Caching (Redis, optional)**
- **Background Jobs (BullMQ, optional)**

📌 **Example Prisma Adapter:**
```ts
// src/adapters/database/PrismaUserRepository.ts
import { PrismaClient } from "@prisma/client";
import { UserRepository } from "../../app/ports/UserRepository";

const prisma = new PrismaClient();

export class PrismaUserRepository implements UserRepository {
  async findById(id: string) {
    return prisma.user.findUnique({ where: { id } });
  }
}
```

📌 **Example HTTP Controller:**
```ts
// src/adapters/http/UserController.ts
import { FastifyInstance } from "fastify";
import { PrismaUserRepository } from "../database/PrismaUserRepository";
import { UserService } from "../../app/services/UserService";

export async function userRoutes(fastify: FastifyInstance) {
  const userRepo = new PrismaUserRepository();
  const userService = new UserService(userRepo);

  fastify.get("/users/:id", async (request, reply) => {
    const user = await userService.getUser(request.params.id);
    reply.send(user);
  });
}
```

---

### 🔵 **3. Entry Points**
Located in `backend/src/server.ts`, responsible for:
- Loading Fastify routes
- Initializing dependencies

📌 **Example Fastify Server Entry:**
```ts
// src/server.ts
import Fastify from "fastify";
import { userRoutes } from "./adapters/http/UserController";

const app = Fastify();

app.register(userRoutes);

app.listen({ port: 3000 }, () => {
  console.log("Server running on http://localhost:3000");
});
```

---

## 🧪 Testing Strategy (Vitest)
- **Unit Tests** (mock dependencies)
- **Integration Tests** (test adapters with real database)
- **E2E Tests** (API endpoint validation)

📌 **Example Unit Test:**
```ts
import { describe, it, expect, vi } from "vitest";
import { UserService } from "../services/UserService";

describe("UserService", () => {
  it("should return a user", async () => {
    const mockRepo = { findById: vi.fn().mockResolvedValue({ id: "1", name: "John" }) };
    const service = new UserService(mockRepo);
    
    const user = await service.getUser("1");
    expect(user).toEqual({ id: "1", name: "John" });
  });
});
```

---

## 🚀 Conclusion
This project follows **Hexagonal Architecture** for **scalability, testability, and maintainability**. The separation of concerns ensures a clean and modular codebase. Feel free to customize it based on your specific needs! 🎯

