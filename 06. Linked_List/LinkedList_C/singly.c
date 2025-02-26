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
    head = NULL;
    tail = NULL;
    size = 0;
    printf("Linked list created successfully!\n");
}

void insertAtBeg(int data) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->next = NULL;  // Initialize next pointer

    if (head == NULL) {  // If list is empty
        head = temp;
        tail = temp;
    } else {
        temp->next = head;  // Point new node to current head
        head = temp;        // Update head
    }
    size++;
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
        head = tail = NULL;
    } else {
        struct Node* temp = head;
        while (temp->next != tail) {
            temp = temp->next;
        }
        free(tail);
        tail = temp;
        temp->next = NULL;
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
    struct Node* toDelete = temp->next;
    temp->next = toDelete->next;
    if (temp->next == NULL) {
        tail = temp;
    }
    free(toDelete);
    size--;
}

void length() {
    printf("The size of linked list is: %d\n", size);
}

void searchByIdx(int idx){
    if(idx < 0 || idx >=size){
        printf("Invalid index\n");
        return;
    }
    struct Node* temp = head;
    for(int i=1; i<idx; i++){
        temp = temp->next;
    }
    printf("The value at index %d is: %d\n", idx, temp->data);
}

void searchByValue(int value){
    struct Node* temp = head;
    int index = 0;

    while(temp != NULL){
        if(temp->data == value){
            printf("The number %d is found at index %d\n", value, index);
            return;
        }
        temp = temp->next;
        index++;
    }

    printf("The number %d is not in this list", value);
}

void display() {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }
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
        printf("1. Create List\n");
        printf("2. Insert at beginning\n");
        printf("3. Insert at end\n");
        printf("4. Insert at index\n");
        printf("5. Delete head\n");
        printf("6. Delete tail\n");
        printf("7. Delete at index\n");
        printf("8. Display list\n");
        printf("9. Display length\n");
        printf("10. Exit\n");
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
                scanf("%d", &index);
                printf("Enter value: ");
                scanf("%d", &data);
                insertAtIdx(index, data);
                break;
            case 5:
                deleteHead();
                break;
            case 6:
                deleteTail();
                break;
            case 7:
                printf("Enter index to delete: ");
                scanf("%d", &index);
                deleteAtIdx(index);
                break;
            case 8:
                display();
                break;
            case 9:
                length();
                break;
            case 10:
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice, try again.\n");
        }
    }
    return 0;
}