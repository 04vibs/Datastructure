using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxSubArray
{
    class Program
    {

        static void Main(string[] args)
        {
            
            int testcases = int.Parse(Console.ReadLine());
            while (testcases != 0)
            {
                int n = int.Parse(Console.ReadLine());

                int[] array = new int[n];
                for (int i = 0; i < n; i++)
                {
                    array[i] = int.Parse(Console.ReadLine());
                }
                int MaxSum = array[0];
                int MaxRgtSum = array[0];

                for (int j = 1; j < n; j++)
                {
                    MaxSum = Math.Max(array[j], array[j] + MaxRgtSum);
                    MaxRgtSum = Math.Max(MaxRgtSum + array[j], MaxSum);
                }

                Console.WriteLine(MaxSum);
                testcases--;
            }
            Console.ReadLine();
        }
    }
}
