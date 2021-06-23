public class Buzao {
    int onibus;
    String sao_paulo;
    String turismo;
    int paradas;
    int capacidade_onibus;
    int pessoas_onibus;

    public Buzao(int onibus, String sao_paulo, String turismo, int paradas, int capacidade_onibus, int pessoas_onibus) {
        this.onibus = onibus;
        this.sao_paulo = sao_paulo;
        this.capacidade_onibus = capacidade_onibus;
        this.pessoas_onibus = pessoas_onibus;
        this.paradas = paradas;
        this.turismo = turismo;

    }
        public int getParadas () {
            return paradas;
        }

        public void setPessoas_onibus ( int pessoas_onibus){
            if (this.pessoas_onibus <= capacidade_onibus) {
                this.pessoas_onibus = pessoas_onibus;
            }
        }

        public void saida ( int pessoas_onibus){
            if (pessoas_onibus <= this.pessoas_onibus) {
                this.pessoas_onibus = pessoas_onibus - this.pessoas_onibus;
            }
        }

        public String parar(){
            return "O onibus parou";
        }
    }
