using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using CalculadoraJunit;

namespace CalculadoraJunitTest
{
    [TestClass]
    public class OperatorTest
    {
        [TestMethod] 
        public void testSum()
        {
            Console.WriteLine("sum");
            int a = 2;
            int b = 3;
            Calculadora instance = new Calculadora(); 
            int result = instance.sum(a, b);
            Assert.AreEqual(5, result); 
        }

        [TestMethod]
        public void testMultiplication()
        {
            Console.WriteLine("multiplication");
            int a = 5;
            int b = 3;
            Calculadora instance = new Calculadora(); 
            int result = instance.multiplication(a, b);
            Assert.AreEqual(15, result);
        }

        [TestMethod]
        public void testHelloWorld()
        {
            Console.WriteLine("helloWorld");
            Calculadora instance = new Calculadora(); 
            string result = instance.helloWorld();
            Assert.AreEqual("Hello World", result);
        }
    }
}