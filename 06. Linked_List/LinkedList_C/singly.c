#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;
struct Node* tail = NULL;
int size = 0;

void createList() {
    if (head == NULL) {
        head = NULL;
        tail = NULL;
        size = 0;
        printf("New Linked List Created!\n");
    } else {
        printf("A linked list already exists. Do you want to reset it? (1 for Yes / 0 for No): ");
        int choice;
        scanf("%d", &choice);
        if (choice == 1) {
            head = NULL;
            tail = NULL;
            size = 0;
            printf("Linked List has been reset!\n");
        } else {
            printf("Continuing with the existing linked list...\n");
        }
    }
}

void insertAtEnd(int data) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->next = NULL;
    
    if (head == NULL) {
        head = temp;
        tail = temp;
    } else {
        tail->next = temp;
        tail = temp;
    }
    size++;
}

void insertAtBeg(int data) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->next = head;
    head = temp;
    if (tail == NULL) { 
        tail = temp; 
    }
    size++;
}

void deleteHead() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct Node* temp = head;
    head = head->next;
    free(temp);
    if (head == NULL) {
        tail = NULL;
    }
    size--;
}

void deleteTail() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    if (head == tail) {
        free(head);
        head = NULL;
        tail = NULL;
    } else {
        struct Node* temp = head;
        while (temp->next != tail) {
            temp = temp->next;
        }
        free(tail);
        tail = temp;
        tail->next = NULL;
    }
    size--;
}

void deleteAtIdx(int idx) {
    if (idx < 0 || idx >= size) {
        printf("Invalid index\n");
        return;
    }
    if (idx == 0) {
        deleteHead();
        return;
    }
    struct Node* temp = head;
    for (int i = 1; i < idx; i++) {
        temp = temp->next;
    }
    struct Node* delNode = temp->next;
    temp->next = delNode->next;
    if (delNode == tail) {
        tail = temp;
    }
    free(delNode);
    size--;
}

void display() {
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main() {
    int choice, data, index;
    while (1) {
        printf("\nMenu:\n");
        printf("1. Create or Reset Linked List\n");
        printf("2. Insert at end\n");
        printf("3. Insert at beginning\n");
        printf("4. Delete head\n");
        printf("5. Delete tail\n");
        printf("6. Delete at index\n");
        printf("7. Display list\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        
        switch (choice) {
            case 1:
                createList();
                break;
            case 2:
                printf("Enter value to insert at end: ");
                scanf("%d", &data);
                insertAtEnd(data);
                break;
            case 3:
                printf("Enter value to insert at beginning: ");
                scanf("%d", &data);
                insertAtBeg(data);
                break;
            case 4:
                deleteHead();
                break;
            case 5:
                deleteTail();
                break;
            case 6:
                printf("Enter index to delete: ");
                scanf("%d", &index);
                deleteAtIdx(index);
                break;
            case 7:
                display();
                break;
            case 8:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice, try again.\n");
        }
    }
    return 0;
}