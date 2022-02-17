
class Sliceing{

    public static void main(String[] args) {

        int[] area = new int[]{1 ,8 ,6 ,2 ,5 ,4 ,8 ,3 ,7} ;
        
        int largestcontainerWLC = largestcontainerWLC(area);
        System.out.println(largestcontainerWLC);

        int largestcontainer = largestcontainer(area);
        System.out.println(largestcontainer);
      
       
    }
    public static int largestcontainer(int[] area)
    {

        int currentresult = 0;
        int resulta = 0;
       
        for(int i = 0 ; i < area.length-1 ; i++)
        {
            for(int j = 0 ; j < area.length-1 ; j++)
            { 
                int currentpoto = area[j];

                resulta = currentpoto * (area.length-1 - j);

                if(currentresult < resulta)
                {
                    currentresult = resulta;
                }
            } 
         
        }
        return currentresult;
    }

    // WLC -> with lowest cost
    public static int largestcontainerWLC(int[] area)
    {   
        int rightposition;
        int leftposition;

        leftposition = 0;
        rightposition = area.length-1;
      
        int leftwall = area[leftposition];
        int rightwall = area[rightposition];
       
        int currentresult = 0;
        int resulta = 0;
        while((rightposition - leftposition) > 0)
        {
            if(leftwall < rightwall)
            {
                resulta = leftwall * (leftposition - rightposition);
                leftposition = leftposition + 1;
                leftwall = area[leftposition];
            }
            else
            {
                resulta = rightwall * (rightposition - leftposition);
                rightposition = rightposition - 1; 
                rightwall = area[rightposition];
            }
            if(currentresult < resulta)
            {
                currentresult = resulta;
            }

        } 

        return currentresult;
    }

}