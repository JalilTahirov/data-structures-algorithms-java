//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    printItems(5);


}


void printItems(int n){
    for(int i = 0; i <= n; i++){
        IO.println(i);
    }

    for(int i = 0; i<= n; i++){
        System.out.println(i);
    }
}


