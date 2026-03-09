package GreedyApproach;
import java.util.*;

public class weight {
    private static class Item{
        int value;
        int weight;
        public String toString(){
            return value + " " + weight;
        }
    }

    private static class ItemComparator implements Comparator<Item>{
        public int compare(Item i1, Item i2){
            if((i1.value/i1.weight) < (i2.value/i2.weight)){
                return 1;
            }
            else if((i1.value / i1.weight) > (i2.value / i2.weight)){// 60 / 10 , 100 / 20 , 150 / 50  
                return -1; 
            }
            else{
                return 0;
            }
        }

    }
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        value.add(60);
        value.add(100);
        value.add(150);
        value.add(120);

        List<Integer> weights = new ArrayList<>();
        weights.add(10);
        weights.add(20);
        weights.add(50);
        weights.add(15);

        List<Item> itemList = new ArrayList<>();
        for(int i=0;i<value.size();i++){
            Item item = new Item();
            item.value = value.get(i);
            item.weight = weights.get(i);
            itemList.add(item);
            System.out.println(item);

        }
        itemList.sort(new ItemComparator());
        System.out.println(itemList);
        int W = 30;
        int profit = 0;
        while(W > 0){
            for(int i=0;i< itemList.size() && W > 0; i++){
                Item item = itemList.get(i);
                if(item.weight <= W){
                    profit += item.value;
                    W -= item.weight;
                }
                else{
                    profit += (item.value) / item.weight * W;
                    W = 0;
                } // 120 + 60 + 25 = 205
            }
        }
        System.out.println("The profit is: "+profit);
    }
    
}
