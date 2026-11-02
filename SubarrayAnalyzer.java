public class SubarrayAnalyzer {
    private int[] tablica;

    public int[] findLongestIncreasingBounds ()
    {
        int start = 0, length = 1;
        int[] tab = new int[2];

        if(tablica.length==0 || tablica==null)
        {
            tab[0] = -1;
            tab[1] = -1;
        }
        else{
            for(int i = 0; i<tablica.length-1; i++)
            {
                int pom = 1;
                int pom2 = i;
                while(tablica[i]<tablica[i+1] && i<tablica.length-1)
                {
                    pom++;
                    i++;
                }
                if(pom>length)
                {
                    start = pom2;
                    length = pom;
                }
            }

            tab[0] = start;
            tab[1] = length+start-1;
        }

        return tab;
    }

    public SubarrayAnalyzer(int[] tablica)
    {
        this.tablica = tablica;
    }
}
