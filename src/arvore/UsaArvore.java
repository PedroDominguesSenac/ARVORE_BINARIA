 
package arvore;
 
public class UsaArvore {
 
    public static void main(String[] args) {
       Arvore arvore=new Arvore();
       arvore.inserir(5);
       arvore.inserir(28);
       arvore.inserir(13);
       arvore.inserir(4);
       arvore.percurso(arvore.getRaiz(),ListaPercursos.values()[2]);
    }
    
}
