import java.util.*;

public class Item implements Comparable<Item>{
   String word;
   String id;
   String type;
   Double score;
   Double other;
   Long time;
   
   public Item(String word, String id, String type, double score){
      this.word = word.toUpperCase();
      this.id = id;
      this.type = type;
      this.score = score;
      this.other = 0.0;
      time = System.currentTimeMillis();-
   }
   
   
   public int compareTo(Item other){
      if(this.other!=0.0 || other.other!=0.0 ){
         if(this.other == other.other){
            return this.time.compareTo(other.time);
         }
         else{
            return this.other.compareTo(other.other);
         }
      }
      else {
         if(this.score==other.score){
            return this.time.compareTo(other.time);
         
         
         }
         else{
            return this.score.compareTo(other.score);
         }
      }
   }


   
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      int N = Integer.parseInt(k.nextLine());
      ArrayList<Item> data = new ArrayList<Item>();
      
      for(int i =0; i< N; i++){
         String s = k.nextLine();
         if(s.charAt(0) == 'A'){
            String[] array = s.split(" ");
            String type  = array[1];
            String id = array[2];
            double score = Double.parseDouble(array[3]);
            String word = "";
            for(int j = 4; j<array.length-1; j++){
               word+= array[j]+ " "; 
            }
            word+= array[array.length-1];
            Item item = new Item(word, id, type, score);
            data.add(item);
         }
         
         else if(s.charAt(0) == 'D'){
            String key = s.substring(4);
            int index = -1;
            
            for(Item t: data){
               if(t.id.equals(key)){
                 index = data.indexOf(t);
               }
            }
            data.remove(data.get(index));
          
         }
         else if(s.charAt(0)=='Q'){
            String[] qa = s.split(" ");
            
            int num = Integer.parseInt(qa[1]);
            
           
            ArrayList<Item> results = new ArrayList<Item>();
                           
            for(Item t: data){
               boolean allof = true;
               inner:for(int m = 2; m<qa.length; m++){
                  String lol = qa[m].toUpperCase();
               
               
               
                  if(!t.word.contains(lol)){
                     allof = false;
                     break inner;
                  }
               }
               if(allof){
                  results.add(t);
               }
                  
            }
            
            Collections.sort(results);
            int lines = (num<results.size())?num:results.size();
            for(int n = results.size()-1; n>=results.size()-lines; n--){
               System.out.print(results.get(n).id+ " ");
            }
            System.out.println("");
            
         }
         else if(s.charAt(0)=='W'){
            String[] myarray = s.split(" ");
            
            int res = Integer.parseInt(myarray[1]);
            int boosts = Integer.parseInt(myarray[2]);
            Map<String, Double> map = new TreeMap<String, Double>();
            for(int p = 3; p< 3+boosts; p++){
               String mapping = myarray[p];
               String[] arr = mapping.split(":");
               map.put(arr[0], Double.parseDouble(arr[1]));
               
            }
            
            
            ArrayList<Item> result = new ArrayList<Item>();
                        
            for(Item r: data){
               boolean all= true;
            
               in:for(int q = 3+boosts; q<myarray.length; q++){
                  String token  = myarray[q];
               
                  token = token.toUpperCase();
                  if(!r.word.contains(token) ){
                     all = false;
                     break in;
                  }
               }
               if(all){
               if(map.containsKey(r.type)){
                     
                  r.other = r.score* map.get(r.type);
                  
                     
                }  
                result.add(r);   
               }
                    
                        
            }
         
         
            Collections.sort(result);
               
            int line = (res<result.size())?res:result.size();
          
            for(int v = result.size()-1; v>=result.size()-line; v--){
               System.out.print(result.get(v).id+ " ");
            }
            System.out.println("");
            
            for (Item it: data){
               it.other = 0.0;
            }
         
         }
      }     
          
          
            
            
            
            
            
            
            
   }
   
            
         
}
  
