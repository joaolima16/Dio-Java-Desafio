package dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    

    

    @Override
    public double calcularXP() {
       
        return XP_PADRAO * cargaHoraria;
    }



    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + "]";
    }



  
    
    

    
}
