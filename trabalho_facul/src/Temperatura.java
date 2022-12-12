public class Temperatura {
    private float graus;
    private String horario;

    private float[][] dados_temp;

    public void Temperatura() {
        float[][] dados_temp = new float[48][2];
    }

   public float getGraus() {
       return this.graus;
   }
   public void setGraus(float graus) {
       this.graus = graus;
   }

    public String getHorario() {
        return this.horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void dados(float horario, float grau) {
        dados_temp[0][0] = 00;
        dados_temp[0][1] = 25;
        dados_temp[4][0] = 02;
        dados_temp[4][1] = 29;
        dados_temp[17][0] = 93;
        dados_temp[17][1] = 37;
        dados_temp[31][0] = 18;
        dados_temp[31][1] = 26; 
    }
}
