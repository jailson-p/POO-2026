void main(){

    IO.println("Olá Segundo Mundo!");

    int i = 2;
    String resultado ;


    switch (i) {
        case 1:
            resultado = "Um";
            break;
        case 2:
            resultado = "Dois";
            break;
        case 3:
            resultado = "Três";
            break;
        default:
            resultado = "outro nª";
    }
    IO.println(resultado);

    String n = switch(i){
        case 1 -> "Só Um";
        case 2 -> "Só Dois";
        case 3 -> "Só Três";
        default -> "Outros";
    };
    IO.println(n);

    int[][] identidade = new int[][] {{1,0,0},{0,1,0},{0,0,1}};

    for (int[] js : identidade) {
        if (js == 1) {
            
        };
    }

}