public class remove_dupli_print_unique {
    int l=numbers.length;
    temp=[];
    for(int i=0;i<=l;i++){
        for(int j=0;j<=1;j++){
            if(numbers[i]!=numbers[j]){
                temp.add(numbers[i]);
            }
        }
    }
    return temp.toArray(new int[0]);
    
}
