#include <stdio.h>
#include <stdlib.h> 

int main() {
    int yourTile = 3;
    int friendTile = 7;

    
    int difference = abs(yourTile - friendTile);
    int canEarnBonus = (difference >= 1 && difference <= 6 && yourTile != friendTile);

    printf("Can earn bonus? %s\n", canEarnBonus ? "true" : "false");

    return 0;
}

/***********OUTPUT***********
an earn bonus? true
*/
