#include<stdio.h>
#include<stdlib.h>

typedef struct TypeQueue{
    int size;
    int rear, front;
    int *arr;
}QE;

void Enqueue(QE *q, int num)
{
    if(q->rear == q->size-1){
        printf("Queue is full");
        return;
    }
    q->rear++;
    q->arr[q->rear] = num;
}

/*
🧠 Your queue style

You are using:

front points BEFORE first element
rear points AT last element

That’s why dequeue does:

Move front → then access
*/

int Dequeue(QE *q)
{
    int a = -1;
    if(q->rear == q->front){
        printf("Queue is empty");
        return a;
    }

    q->front++;
    a = q->arr[q->front];
    return a;
}

int main()
{
    QE Xq;

    Xq.size = 222;
    Xq.front = Xq.rear = 0;
    Xq.arr = (int*) malloc(Xq.size * sizeof(int));

    // BFS implementation

    int node;
    int visited[7] = {0,0,0,0,0,0,0};
    int i=0;
    int a[7][7] = {
     // {0,1,2,3,4,5,6}
        {0,1,1,1,0,0,0}, // For 0
        {1,0,1,0,0,0,0}, // For 1
        {1,1,0,1,1,0,0}, // For 2
        {1,0,1,0,1,0,0}, // For 3
        {0,0,1,1,0,1,1}, // For 4
        {0,0,0,0,1,0,0}, // For 5
        {0,0,0,0,1,0,0}  // For 6
    };
    
    visited[i] = 1;
    Enqueue(&Xq,i);  // Enqueue 1 for exploration

    printf("%d ",i);

    while(Xq.rear != Xq.front)
    {
        node = Dequeue(&Xq);
        for (int j = 0; j < 7; j++)
        {
            if(a[node][j] == 1 && visited[j] == 0){
                visited[j] = 1;
                printf("%d ",j);
                Enqueue(&Xq, j);
            }
        }
        
    }

    return 0;
}

// In your queue:
// front stays one step behind the first element