#include<stdio.h>

int visited[7] = {0,0,0,0,0,0,0};
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

void DFS(int i)
{
    printf("%d ",i);
    visited[i] = 1;
    for (int j = 0; j < 7; j++)
    {
        if(a[i][j] == 1 && visited[j] != 1)
            DFS(j);
    }
}

int main()
{
    DFS(3);

    return 0;
}