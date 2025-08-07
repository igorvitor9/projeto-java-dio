package diocurso;

import java.time.LocalDate;

public class mentoria {

   private String titulo;
   private String descricao;
   private LocalDate data;

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }



   public String getTitulo() {
      return titulo;
   }
   public String getDescricao() {
      return descricao;
   }
   public LocalDate getData() {
      return data;
   }

   @Override
   public String toString() {
      return "mentoria{" +
              "titulo='" + titulo + '\'' +
              ", descricao='" + descricao + '\'' +
              ", data=" + data +
              '}';
   }
}