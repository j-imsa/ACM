import java.util.*;

// 102 - Ecological Bin Packing
public class EcologicalBinPacking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input = scanner.nextLine();

			/*
			 * numbers[0] => B1 numbers[1] => G1 numbers[2] => C1 
			 * numbers[3] => B2	numbers[4] => G2 numbers[5] => C2 
			 * numbers[6] => B3 numbers[7] => G3 numbers[8] => C3
			 * 
			 * BGC means bin1:B , bin2:G , bin3:C 
			 * BGC => from bin1(G1, C1) + from bin2(B2 + C2) + from bin3(B3 + G3)
			 * ...
			 */
			
			long[] numbers = Arrays.stream(input.split(" ")).mapToLong(Long::parseLong).toArray();

			HashMap<String, Long> order = new HashMap();
			
			order.put("BGC", numbers[1] + numbers[2] + numbers[3] + numbers[5] + numbers[6] + numbers[7]);
			order.put("BCG", numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[6] + numbers[8]);
			order.put("GBC", numbers[0] + numbers[2] + numbers[4] + numbers[5] + numbers[6] + numbers[7]);
			order.put("CBG", numbers[0] + numbers[1] + numbers[4] + numbers[5] + numbers[6] + numbers[8]);
			order.put("GCB", numbers[0] + numbers[2] + numbers[3] + numbers[4] + numbers[7] + numbers[8]);
			order.put("CGB", numbers[0] + numbers[1] + numbers[3] + numbers[5] + numbers[7] + numbers[8]);

			order = sortHashMapByValue(order);
			
			Map.Entry<String,Long> entry = order.entrySet().iterator().next();
			 
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	 
    public static HashMap<String, Long> sortHashMapByValue(HashMap<String, Long> hm)
    {
        
        List<Map.Entry<String, Long> > list =
               new LinkedList<Map.Entry<String, Long> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Long> >() {
            public int compare(Map.Entry<String, Long> o1,
                               Map.Entry<String, Long> o2)
            {
            	if (o1.getValue() > o2.getValue()) {
					return 1;
				} else if (o1.getValue() < o2.getValue()) {
					return -1;
				} else {
					return (o1.getKey()).compareTo(o2.getKey());					
				}
            }
        });
         
        HashMap<String, Long> temp = new LinkedHashMap<String, Long>();
        for (Map.Entry<String, Long> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}
