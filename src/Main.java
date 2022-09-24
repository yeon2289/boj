import java.util.*;
public class Main {
    public static void main(String[] args) {
        //입력받기
        Scanner sc=new Scanner(System.in);
        int MuNum=sc.nextInt();
        int QeNum=sc.nextInt();

        //악보 array
        int Muarr[]=new int[MuNum];
        //질문 array
        int Qearr[]=new int[QeNum];
        //시간 list
        ArrayList TiList=new ArrayList<>(10000);

        //악보 시간 입력
        for(int i=0;i<Muarr.length;i++){
            Muarr[i]=sc.nextInt();
           }
        //질문 index 입력
        for(int i=0;i<Qearr.length;i++){
            Qearr[i]=sc.nextInt();
        }

        //Timeline 입력
        for(int j=0;j<Muarr.length;j++){
            for(int i=0;i<Muarr[j];i++){
                TiList.add(j+1);
            }
        }
        /*for(int i=0;i<Muarr.length;i++){
            System.out.println(Muarr[i]);
        }

        System.out.println(QeList);
        System.out.println(TiList);*/

        for(int i=0;i<Qearr.length;i++){
            System.out.println(TiList.get(Qearr[i]));
        }






    }
}