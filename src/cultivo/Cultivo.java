//Solución Reto#3 Ciclo 2 MisionTIC2022
package cultivo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cultivo {
    
    public static ArrayList<String> obtenerCultivos(ArrayList<String> lista){
        Set<String> listaUnicos = new HashSet<> (lista);
        lista.clear();
        lista.addAll(listaUnicos);
        return lista;
    }
    
    public static ArrayList<Integer> obtenerCultivosPendientes(ArrayList<Integer> posh, ArrayList<String> pendientes, String cultivo){
        for(int i=0; i<posh.size(); i++){
            if(!pendientes.get(posh.get(i)).equals(cultivo)){
                posh.remove(i);
            }
        }
        return posh;
    }
    
    public static ArrayList<String> obtenerFaltantes(ArrayList<String> l_otrafinca, ArrayList<String> l_fincamartha){
        ArrayList<String> intercambio = new ArrayList<>();
        for(String culti : l_otrafinca){
            if(!l_fincamartha.contains(culti)){
                intercambio.add(culti);
            }
        }
        return intercambio;
    }
    
    public static Integer obtenerExcedentesIntercambiables(ArrayList<String> l_otrafinca, ArrayList<String> l_fincamartha){
        int numIntOtraFinca = 0;
        for(String cultOtraFinca : l_otrafinca){
            if (!l_fincamartha.contains(cultOtraFinca)){
                numIntOtraFinca++;
            }
        }
        int numIntFincaMartha = 0;
        for(String cultFincaM : l_fincamartha){
            if (!l_otrafinca.contains(cultFincaM)){
                numIntFincaMartha++;
            }
        }
        int numIntercambio = Math.min(numIntOtraFinca, numIntFincaMartha);
        return numIntercambio;
    }
}
/*public class Cultivo {
    
    public static ArrayList<String> obtenerCultivos(ArrayList<String> listaCultivo){
        ArrayList <String> cultivoSinRepetir = new ArrayList<String>();
        for(String Cultivo: listaCultivo){
            if(!cultivoSinRepetir.contains(Cultivo)){
                cultivoSinRepetir.add(Cultivo);
            }
        }
        System.out.println(cultivoSinRepetir);
        return cultivoSinRepetir;
    }
    public static ArrayList<Integer> obtenerCultivosPendientes(ArrayList<Integer> posh, ArrayList<String> pendientes, String cultivo) {
        ArrayList<Integer> cultivosFaltantes = new ArrayList<>();
        for(Integer indice : posh){
            if(pendientes.get(indice)== cultivo){
                cultivosFaltantes.add(indice);
            }
        }
        System.out.println(cultivosFaltantes);
        return  cultivosFaltantes;
    }

    public static ArrayList <String> obtenerFaltantes(ArrayList<String> l_otrafinca, ArrayList<String> l_fincamartha){
        ArrayList<String> faltantes = new ArrayList<String>();
        for(String cultivo : l_otrafinca){
            if(!l_fincamartha.contains(cultivo)){
                faltantes.add(cultivo);
            }
        }
        System.out.println(faltantes);
        return faltantes;
    }

    public static Integer obtenerExcedentesIntercambiables(ArrayList<String> l_otrafinca, ArrayList<String> l_fincamartha){
        int cultivosIntercambiablesotra = 0; 
        int cultivosIntercambiablesMartha = 0;

        for(String cultivo: l_otrafinca){
            if(!l_fincamartha.contains(cultivo)){
                cultivosIntercambiablesotra += 1;
            }
        }

        for(String cultivo: l_fincamartha){
            if(!l_otrafinca.contains(cultivo)){
                cultivosIntercambiablesMartha += 1;
            }
        }

        Integer cultivosIntercambiables =
                
                Math.min(cultivosIntercambiablesotra, cultivosIntercambiablesMartha);
        return  cultivosIntercambiables;
    }

}*/