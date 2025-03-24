#include <stdio.h>
#include <stdlib.h>

// Circular Linked List Node
struct Node {
    int data;
    struct Node* next;
};

struct Node* head = NULL;
struct Node* tail = NULL;
int size = 0;

// Create or Reset Linked List
void createList() {
    if (head == NULL) {
        head = NULL;
        tail = NULL;
        size = 0;
        printf("New Circular Linked List Created!\n");
    }  
}

// Insert at beginning
void insertAtBeg(int data) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    if (head == NULL) {
        head = temp;
        tail = temp;
        temp->next = head;
    } else {
        temp->next = head;
        head = temp;
        tail->next = head;
    }
    size++;
}

// Insert at end
void insertAtEnd(int data) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    if (head == NULL) {
        head = temp;
        tail = temp;
        temp->next = head;
    } else {
        tail->next = temp;
        tail = temp;
        tail->next = head;
    }
    size++;
}

// Insert at index
void insertAtIdx(int idx, int data) {
    if (idx < 0 || idx > size) {
        printf("Invalid index\n");
        return;
    }
    if (idx == 0) {
        insertAtBeg(data);
        return;
    }
    struct Node* temp = head;
    for (int i = 1; i < idx; i++) {
        temp = temp->next;
    }
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = temp->next;
    temp->next = newNode;
    if (newNode->next == head) {
        tail = newNode;
    }
    size++;
}

// Delete head
void deleteHead() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    if (head == tail) {
        free(head);
        head = NULL;
        tail = NULL;
        size = 0;
    } else {
        struct Node* temp = head;
        head = head->next;
        tail->next = head;
        free(temp);
        size--;
    }
}

// Delete tail
void deleteTail() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    if (head == tail) {
        free(head);
        head = NULL;
        tail = NULL;
        size = 0;
    } else {
        struct Node* temp = head;
        while (temp->next != tail) {
            temp = temp->next;
        }
        free(tail);
        tail = temp;
        tail->next = head;
        size--;
    }
}

// Delete at index
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

// Display list using while loop
void display() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
    struct Node* temp = head;
    while (1) {
        printf("%d -> ", temp->data);
        temp = temp->next;
        if (temp == head) break;
    }
    printf("(Back to Head)\n");
}

int main() {
    int choice, data, idx;
    while (1) {
        printf("\nMenu:\n");
        printf("1. Create or Reset Linked List\n");
        printf("2. Insert at beginning\n");
        printf("3. Insert at end\n");
        printf("4. Insert at index\n");
        printf("5. Delete head\n");
        printf("6. Delete tail\n");
        printf("7. Delete at index\n");
        printf("8. Display list\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                createList();
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &data);
                insertAtBeg(data);
                break;
            case 3:
                printf("Enter value: ");
                scanf("%d", &data);
                insertAtEnd(data);
                break;
            case 4:
                printf("Enter index: ");
                scanf("%d", &idx);
                printf("Enter value: ");
                scanf("%d", &data);
                insertAtIdx(idx, data);
                break;
            case 5:
                deleteHead();
                break;
            case 6:
                deleteTail();
                break;
            case 7:
                printf("Enter index to delete: ");
                scanf("%d", &idx);
                deleteAtIdx(idx);
                break;
            case 8:
                display();
                break;
            case 9:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice, try again.\n");
        }
    }
    return 0;
}
