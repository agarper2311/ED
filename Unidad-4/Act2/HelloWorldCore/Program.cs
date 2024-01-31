using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloWorldCore
{
    public class Program
    {
        public static void Main()
        {
            Console.WriteLine("Hello World!");

            // Antes de agregar ésta línea, no podía ver lo que aparecía en la terminal
            // Agrega una pausa para que la terminal no se cierre inmediatamente
            Console.WriteLine("Presiona cualquier tecla para salir...");
            Console.ReadKey();
        }
    }
}
