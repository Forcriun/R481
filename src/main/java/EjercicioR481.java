import java.util.ArrayList;

class EjercicioR481
{
    public String devolverEnOrden(ArrayList<Integer> numeros)
    {
        // Escribe tu código a continuación...
        String cadenaADevolver = "";

        if (numeros.size() > 0){
            while(numeros.size() > 0){
                Integer numMayor = 0;
                int x = 0;  // Contador del bucle
                int posicionNumMayor = 0;

                while(x < numeros.size()){
                    if(numeros.get(x) >= numeros.get(posicionNumMayor)){
                        numMayor = numeros.get(x);
                        posicionNumMayor = x;
                    }
                    x++;
                }

                cadenaADevolver += " " + numMayor + ",";
                numeros.remove(posicionNumMayor);
            }
            cadenaADevolver = cadenaADevolver.substring(0,cadenaADevolver.length()-1);
        }
        return cadenaADevolver.trim();
    }

    // A continuación puedes escribir otros métodos si lo necesitas...
}