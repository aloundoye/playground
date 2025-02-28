import os
import re

# Configuration
TXT_FILE = "React Query.txt"
VIDEO_EXTENSIONS = ('.mp4')  # Supported video formats

def find_lesson_file(lesson_number):
    """Find a lesson file with the given number, case-insensitive"""
    pattern = re.compile(rf'lesson{lesson_number}\D', re.IGNORECASE)
    for f in os.listdir():
        if any(f.lower().endswith(ext) for ext in VIDEO_EXTENSIONS):
            if pattern.search(f):
                return f
    return None

def main():
    # Read the text file with names
    with open(TXT_FILE, 'r', encoding='utf-8') as f:
        names = [line.strip() for line in f if line.strip()]
    
    # Rename files in sequence
    for index, name in enumerate(names, start=1):
        # Find the lesson file for this index
        old_name = find_lesson_file(index)
        
        if not old_name:
            print(f"⚠️ Lesson {index} file not found")
            continue
            
        # Create new filename
        ext = os.path.splitext(old_name)[1]
        new_name = f"{index}. {name}{ext}"
        
        try:
            os.rename(old_name, new_name)
            print(f"✅ Renamed: {old_name} -> {new_name}")
        except Exception as e:
            print(f"❌ Error renaming {old_name}: {str(e)}")

if __name__ == "__main__":
    main()
    print("\nRenaming process completed!")