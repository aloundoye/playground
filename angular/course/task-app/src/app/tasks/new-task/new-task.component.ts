import { Component, EventEmitter, inject, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { TasksService } from '../tasks.services';

@Component({
  selector: 'app-new-task',
  imports: [FormsModule],
  templateUrl: './new-task.component.html',
  styleUrl: './new-task.component.css',
})
export class NewTaskComponent {
  @Input({ required: true }) userId!: string;
  @Output() close = new EventEmitter<void>();
  title = '';
  summary = '';
  dueDate = '';
  private tasksService = inject(TasksService);

  onCancelAddTask() {
    this.close.emit();
  }
  onSubmitTask() {
    this.tasksService.addTask(
      {
        title: this.title,
        summary: this.summary,
        dueDate: this.dueDate,
      },
      this.userId,
    );

    this.close.emit();
  }
}
