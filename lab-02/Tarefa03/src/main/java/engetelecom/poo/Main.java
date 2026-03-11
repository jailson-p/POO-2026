package engetelecom.poo;

public class Main {
    static void main(String[] args) {

        String respostaArgError =   "Forma incorreta de argumento.\nForneça o argumento da seguinte forma:\n\t\ttriangulo n°\n\t\tlosango nº\n\t\tretangulo nº nº";

        //Teste de tamanho mínimo para o argumento
        if( args.length < 2 ){
            IO.println(respostaArgError);
            return;
        }

        String tipo = args[0];

        int[] dimensao = new int[args.length-1] ;
        //Valida e distribui no vetor dimensao
        for (int i = 1; i < args.length; i++) {
            if (args[i].matches("-?\\d+"))
                dimensao[i-1] = Integer.parseInt(args[i]);
            else {
                IO.println(respostaArgError);
                return;
            }
        }

        switch (tipo.toLowerCase()){
            case "triangulo":
                IO.println("java AsciiArt " + tipo.toLowerCase() + " " + dimensao[0] + "\n");
                for(int i = 0;i < dimensao[0];i++) IO.println("*".repeat(i+1));
                IO.println();
                break;
			case "losango":
                int meio = dimensao[0]/2;
                boolean par = dimensao[0] % 2 == 0;
                StringBuffer textopass = new StringBuffer();
                StringBuffer losango = new StringBuffer();
                for (int i = 0; i < dimensao[0]; i++) {
                    if(i == 0){
                        textopass.append(" ".repeat(meio)).append("*").append(" ".repeat(meio));
                    }
                    // sai da condicional quando atigir o meio de um tamanho par e repete a última carga do textopass
                    else if(i == meio && par) {}
                    else if(i <= meio ) {
                        textopass.setCharAt(textopass.indexOf("*")-1,'*');
                        textopass.setCharAt(textopass.lastIndexOf("*")+1,'*');
                    }
                    else {
                        textopass.setCharAt(textopass.indexOf("*"), ' ');
                        textopass.setCharAt(textopass.lastIndexOf("*"),' ');
                    }
                    losango.append(textopass).append("\n");
                }
                IO.println("java AsciiArt " + tipo.toLowerCase() + " " + dimensao[0] + "\n");

                IO.println(losango.toString());
				break;
			case "retangulo":
                StringBuffer retangulo = new StringBuffer();
                for (int i = 0; i < dimensao[1]; i++) {
                    if(i == 0 || i == dimensao[1]-1)
                        retangulo.append("*".repeat(dimensao[0])).append("\n");
                    else
                        retangulo.append("*").append(" ".repeat(dimensao[0] - 2)).append("*\n");
                }
                IO.println("java AsciiArt " + tipo.toLowerCase() + " " + dimensao[0] + " " + dimensao[1] + "\n");
                IO.println(retangulo);
				break;
			default: IO.println(respostaArgError);
        }
    }
}


