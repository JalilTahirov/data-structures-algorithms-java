void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    var h = addItems(10);
    System.out.println(h);
}

void printItems(int n){
    for(int i = 0; i <= n; i++){
        IO.println(i);
    }
    for(int i = 0; i<= n; i++){
        System.out.println(i);
    }
}

void printSquare(int n){
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++) {
            System.out.println(i + " " + j);
        }
    }
}

int addItems(int n){
    return n + n;
}