package com.akkie.tortoisegit;
import java.util.HashSet;  
import java.util.Iterator;  
import java.util.Set;  
  
/** 
 * Java Set/HashSetの使い方についてシンプルなサンプル 
 * 
 *　１）Setインスタンスの生成 
 *　２）Setに要素の追加 
 *　３）Setから要素の取得 
 *　４）Setから要素の削除 
 */  
public class TestHashSet {  
    public static void main(String []args) {  
        ////////////////////////////////////  
        //１）HashSetからSetのインスタンスを生成  
        Set set = new HashSet();    //その他コンストラクタもあります。詳細はAPI DOCを参照  
          
        ////////////////////////////////////  
        //２）Setに要素の追加  
        set.add("Hello Java Set!");   //String型  
        Integer age = new Integer(100);  
        set.add(age);     //Integer型  
        set.add(age);     //同じオブジェクト重複追加  
        set.add("Hello Java Set!");     //同じオブジェクト重複追加  
        set.add(null);     //null要素  
        //set.addAll(Collection);       //コレクション型データを一括追加  
        //...   その他型の値の追加もできますよ  
        System.out.println("size=" + set.size());    
          
        ////////////////////////////////////  
        //３）Setから要素の取得  
                  
        System.out.println("************** Iterator **************");  
        //反復子iteratorによる取得  
        Iterator ite = set.iterator();     //実際のプログラム中に、null判定を忘れずに  
                                            //コレクションの反復子iterator  
        while(ite.hasNext()) {              //ループ  
            Object obj = ite.next();        //該当オブジェクト取得  
              
            if (obj instanceof String) {    //String型の場合  
                System.out.println((String)obj);  
            } else if (obj instanceof Integer) {    //Integer型の場合  
                System.out.println(((Integer)obj).intValue());  
            }  
              
        }  
          
        System.out.println("************** Set-> Array  / for (Object obj : Object []) **************");  
        //Set を　配列に変換  
        Object []objs = set.toArray();  
        //for ループによる取得  
        for (Object obj : objs) {  
            if (obj instanceof String) {    //String型の場合  
                System.out.println((String)obj);  
            } else if (obj instanceof Integer) {    //Integer型の場合  
                System.out.println(((Integer)obj).intValue());  
            }  
        }  
          
        System.out.println("************** for (Object obj : set) **************");  
        //Setから直接Object要素を取得。Java5から。  
        for (Object obj : set) {  
            if (obj instanceof String) {    //String型の場合  
                System.out.println((String)obj);  
            } else if (obj instanceof Integer) {    //Integer型の場合  
                System.out.println(((Integer)obj).intValue());  
            }  
        }  
          
        System.out.println("************** Set要素の削除、サイズ、空判定 **************");  
        //４）その他  
        //Setから要素の削除  
        set.remove(0);  
        //Setのサイズ取得  
        System.out.println("size=" + set.size());  
        //要素があるかどうか  
        System.out.println("empty=" + set.isEmpty());  
          
    }  
} 