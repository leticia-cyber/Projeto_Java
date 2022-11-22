
/*RETORNA O TOTAL DE MULHERES ELEITAS 
    INPUTs: Lista de Candidatos Eleitos
    OUTPUTs: Número de Mulheres eleitas
    Pré-condição: Lista de Candidatos Eleitos deve existir
    Pós-condição: Double para número de Mulheres eleitas existe e é >=0
    */
    public double retornaQtdEleitosSexoFeminino(ArrayList<Candidato> candidatosEleitos){
        double qtd = 0;
        
        for(int i=0; i < candidatosEleitos.size(); i++){
            if(candidatosEleitos.get(i).getSexo().equals("F")) qtd++;
        }
 
        return qtd;
    }

/*IMPRIME O RELATÓRIO 8
    INPUTs: Array com Candidatos Eleitos, Número de Vagas e Data da eleição.
    OUTPUTs: -
    Pré-condição: Array deve estar inicializado e preenchido. Número de Vagas deve existir e ser >=0. Data da eleição deve ser válida
    Pós-condição: -
    */
    public void imprimeEleitosFaixaEtaria (ArrayList<Candidato> candidatosEleitos, double numeroVagas, String data){
        System.out.println("Eleitos, por faixa etária (na data da eleição):");
        
        int idades[] = new int[(int)numeroVagas];
        int contMenor30 = 0, cont30Menor40 = 0, cont40Menor50 = 0, cont50Menor60 = 0, contMaior60 =0;

        for(int i=0; i< candidatosEleitos.size(); i++){
            idades[i] = candidatosEleitos.get(i).retornaIdadeCandidato(data);
        }

        for(int i=0; i < idades.length;i++){
            if(idades[i] < 30){
                contMenor30++;
            }else if(idades[i] >=30 && idades[i] < 40){
                cont30Menor40++;
            }else if(idades[i] >= 40 && idades[i] < 50){
                cont40Menor50++;
            }else if(idades[i] >= 50 && idades[i] < 60){
                cont50Menor60++;
            }else{
                contMaior60++;
            }
        }

        double porcentagem = (float)contMenor30/(float)numeroVagas*100;

        System.out.println(String.format("      Idade < 30: %d (%.2f%%)", contMenor30,porcentagem));
        porcentagem = (float)cont30Menor40/(float)numeroVagas*100;
        System.out.println(String.format("30 <= Idade < 40: %d (%.2f%%)", cont30Menor40,porcentagem));
        porcentagem = (float)cont40Menor50/(float)numeroVagas*100;
        System.out.println(String.format("40 <= Idade < 50: %d (%.2f%%)", cont40Menor50,porcentagem));
        porcentagem = (float)cont50Menor60/(float)numeroVagas*100;
        System.out.println(String.format("50 <= Idade < 60: %d (%.2f%%)", cont50Menor60,porcentagem));
        porcentagem = (float)contMaior60/(float)numeroVagas*100;
        System.out.println(String.format("60 <= Idade     : %d (%.2f%%)", contMaior60, porcentagem));
        System.out.println();
    }


/*IMPRIME O RELATÓRIO 9
    INPUTs: Número de Vagas, Quantidade de Eleitos do sexo feminino e Porcentagens (F e M)
    OUTPUTs: -
    Pré-condição: Variáveis devem existir
    Pós-condição: -
    */
    public void imprimeEleitosPorSexo (double numeroVagas, double qtdF, double porcentagemF, double porcentagemM){
        System.out.println("Eleitos, por sexo:");

        System.out.print("Feminino:  " + String.format("%.0f", qtdF));
        System.out.println(String.format(" (%.2f", porcentagemF) + "%)");
        System.out.print("Masculino: " + String.format("%.0f", (numeroVagas - qtdF)));
        System.out.println(String.format(" (%.2f", porcentagemM) + "%)\n");
    }