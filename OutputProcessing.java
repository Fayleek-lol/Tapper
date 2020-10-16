final public class OutputProcessing 
{
    public static void outputTupperResult(char[][] tupperFunctionResult)
    {
        for (int i = 0; i < tupperFunctionResult.length; i++)
        {
            for (int j = 0; j < tupperFunctionResult[0].length; j++)
                System.out.print(tupperFunctionResult[i][j]);
            System.out.println();
        }
    }
}
