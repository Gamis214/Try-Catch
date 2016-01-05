# Try Catch
Ejemplo aplicando Try &amp; Catch

##Ejemplo
La estrcutura de un **try** - **catch** se compone de la siguiente manera:
```java
try{
    
}catch (Exception e){
    
}finally {
    
}
```
Donde en:
* **Try**: Lo usaremos para ejecutar el codigo que tal vez pueda arrojarnos algun error en el proceso
* **Catch**: Esta parte se ejecutara cuando el codigo de try llegue a fallar y generar una exepcion.
* **Finally**: Esta parte se ejecutara forzosamente ya sea al terminar el try exitosamente o el error catch.

###Ejercicio
Creamos un metodo:
```java
private void divison(){
    int a = 7/0;
}
```
el cual contiene un error esto para poder entrar al catch.

Nuestro metodo **Main** queda de la siguiente forma:
```java
public class Main {

    public static void main(String[] args) {

        Main mn = new Main();

	    try{
            mn.divison();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("MSJ FINAL");
        }

    }

    private void divison(){
        int a = 7/0;
    }

}
```
El resultado final debe ser:
```
Error: / by zero
MSJ FINAL
```
