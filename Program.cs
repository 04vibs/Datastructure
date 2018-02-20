using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxCircularSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int testcases = int.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());

            int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = int.Parse(Console.ReadLine());
            }

            int Max = array[0];
            int MaxRgtSum;

            for (int j = 0; j < n; j++)
            {
                MaxRgtSum = array[j];
                for (int k = (j+1)%n; k != (j+n) % n; k=(k+1)%n )
                {
                    // MaxRgtSum = Math.Max(MaxRgtSum , array[j]+ MaxRgtSum);
                    MaxRgtSum += array[k];
                    if (Max < MaxRgtSum)
                    {
                        Max = MaxRgtSum;
                    }
                }
            }
           
            Console.WriteLine(Max);
            Console.ReadLine();
        }
    }
}
