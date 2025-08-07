package diocurso;


import java.time.LocalDate;

public class mentoria extends conteudo {


   private LocalDate data;

   @Override
   public double calcularxp() {
      return XP_PRADRAO =200;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }




   public LocalDate getData() {
      return data;
   }

   @Override
   public String toString() {
      return "mentoria{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", data=" + data +
              '}';
   }


}