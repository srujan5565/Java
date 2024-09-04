import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

class Node{
    Integer data;
    // Node n1=null,n2=null,n3=null;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Tree{
Node addNode(Node root,int value){
    if(root==null){
        return new Node(value);
    }
    if(value<root.data){
        root.left=addNode(root.left, value);
    }
    else if(value>root.data) {
        root.right=addNode(root.right, value);
    }
    else  return root;
    return root;
}
void display(Node root){
    Node temp=root;
    while(temp.left!=null){
        System.out.print(temp.left.data);
        temp=temp.left;
    }
    temp=root;
    while(temp.right!=null){
        System.out.print(temp.right.data);
        temp=temp.right;
    }
}
void search(Node root,int num){
    if(root!=null){
    if(root.data==num) System.out.println("Found Key");
    else if(root.data>num)
    search(root.left, num) ;
    else
    search(root.right, num); 
    }
}
void preorder(Node root){
if(root!=null){
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}
}
void inorder(Node root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    }
void postorder(Node root){
if(root!=null){
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}
}
Node toTree(Node root,int[] arr,int index){
    if(index<arr.length){
        Node temp=new Node(arr[index]);
        root=temp;
        root.left=toTree(root.left, arr, 2*index+1);
        root.right=toTree(root.right, arr, 2*index+2);
    }
    return root;
}
int findHeight(Node root){
    if(root==null) return -1;
    int left=findHeight(root.left)+1;
    int right=findHeight(root.right)+1;
    return Math.max(left,right);
}
void levelOrderTraversal(Node root,int height){
    for(int i=0;i<=height;i++)
    {printLevel(root,i);
    System.out.println();
    }
}
void printLevel(Node root,int level){
        if(level==0) System.out.print(root.data);
        else {
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }
}


// void printLevelWithout

static int count;
int countNoNodes(Node root){
    /*
     * if(root!=null){
        count++;
        countNoNodes(root.left);
        countNoNodes(root.right);
    }
    return count;
     */
    if(root==null) return 0;
    else return countNoNodes(root.left)+countNoNodes(root.right)+1;
}

boolean isPerfectBinTree(Node root){
    if(countNoNodes(root)==Math.pow(2, findHeight(root)+1)-1)
    return true;
    return false;
}

Node mirror(Node root){
    Node newRoot;
    if(root!=null){
        newRoot=root.left;
        root.left=root.right;
        root.right=newRoot;
        mirror(root.left);
        mirror(root.right);
    }
    return root;
}
// void leftView(Node root){
//     for(int i=0;i<=findHeight(root);i++){
//         Queue<Integer> q=new LinkedList<>();
//         printLevelForView(root, i,q);   
//         System.out.println(q.peek());
//     }
// }

// void rightView(Node root){
//     for(int i=0;i<=findHeight(root);i++){
//         Queue<Integer> q=new LinkedList<>();
//         printLevelForView(root, i,q);   
//         System.out.println(q.);
//     }
// }

// void LeftView(Node root){
//     Queue<Node> queue= new LinkedList<>();
//     queue.add(root);
//     while (!queue.isEmpty()){
//       int n= queue.size();
//       for(int i=0;i<n;i++){
//         Node temp = queue.poll();
//         if(i==0){ //i==0 left view , i==n-1 right view  internal i!=0 && i!=n-1 
//           System.err.print(temp.data+" ");
//         }
//         if(temp.left!=null){
//         queue.add(temp.left);
//         }
//         if(temp.right!=null){
//         queue.add(temp.right);
//         }
//       }
//     }




//   ArrayDeque<Node> queue=new ArrayDeque<>();
//   Node temp=root.left;
//   while(temp!=null)
//   {
//     queue.addFirst(temp);
//     temp=temp.left;
//   }
//   while(!queue.isEmpty())
//   {
//     temp=queue.remove();
//     System.out.print(temp.data+" ");
//   }
//   temp=root;
//   while(temp!=null)
//   {
//     System.out.print(temp.data+" ");
//     temp=temp.right;
//     }
//   }

void bottomView(Node root){
    Queue<QueueItem> queue=new LinkedList<>();
    TreeMap<Integer,Integer> map=new TreeMap<>();
    TreeMap<Integer,ArrayList<Integer>> VerticalOrder=new TreeMap<>();
    queue.add(new QueueItem(root, 0));
    while(!queue.isEmpty()){
        QueueItem temp=queue.poll();
        Node node=temp.root;
        int hd=temp.hd;
        map.put(hd,node.data);
        VerticalOrder.putIfAbsent(hd,new ArrayList<>());
        VerticalOrder.get(hd).add(node.data);
        //level order
        if(node.left!=null) queue.add(new QueueItem(node.left, hd-1));
        if(node.right!=null) queue.add(new QueueItem(node.right, hd+1));
    }
    System.out.println(map);
    System.out.println(VerticalOrder);
    
}



void printLevelForView(Node root,int level,Queue<Integer> q){
    if(root!=null){
    if(level==0) 
    {
        q.add(root.data);
    }
    else {
        printLevelForView(root.left, level-1,q);
        printLevelForView(root.right, level-1,q);
    }
    }
}

void binSearchInTree(Node root,int num){
    if(root!=null){
    if(root.data==num)
    System.out.println("Found");
    else if(root.data<num) binSearchInTree(root.right, num);
    else binSearchInTree(root.left, num);
}
else System.out.println("Not Found");
}

void printGivenLevel(Node root,int level){
    if(root!=null){
    if(level==0) System.out.print(root.data+" ");
    else{ 
    printGivenLevel(root.left, level-1);
    printGivenLevel(root.right, level-1);
    }
}
}

}

class QueueItem{
    Node root;
    int hd;
    QueueItem(Node root,int hd){
        this.root=root;
        this.hd=hd;
    }
}

public class TreeCode_Raw {
    public static void main(String[] args) {
        // Node root=new Node(1);
        // root.left=new Node(2);
        // root.right=new Node(3);
        // // System.out.println(root.data);
        // // System.out.println(root.n2.n1.data);
        // System.out.println(root.data+" "+root.left.data+" "+root.right.data);

        //BINARY TREE
        // Tree binTree =new Tree();
        // Node root=new Node(3);
        // root=binTree.addNode(root, 2);
        // root=binTree.addNode(root, 5);
        // root=binTree.addNode(root, 4);
        // root=binTree.addNode(root, 1);
        // root=binTree.addNode(root, 6);
        // // binTree.display(root);
        // binTree.search(root, 44);
        // binTree.preorder(root);
        // System.out.println();
        // binTree.inorder(root);
        // System.out.println();
        // binTree.postorder(root);

        //ARRAY TO TREE
        int arr[]={5,6,3,7,2,9,4,1};
        Tree array=new Tree();
        // Node root2=array.toTree(null, arr, 0);
        // root2.right.right.right=new Node(9);
        // array.inorder(root2);
        // System.out.println(array.findHeight(root2));
        // array.levelOrderTraversal(root2, array.findHeight(root2));
        // System.out.println(array.countNoNodes(root2));
        // System.out.println(array.isPerfectBinTree(root2));

        // array.levelOrderTraversal(root2,array.findHeight(root2));
        // array.mirror(root2);System.out.println();
        // array.levelOrderTraversal(root2,array.findHeight(root2));
        // array.LeftView(root2);

        Node root3=new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            array.addNode(root3, arr[i]);
        }
        // array.binSearchInTree(root3,3);
        // array.bottomView(root3);
        // for(int i=0;i<=array.findHeight(root3);i++){
        //     array.printGivenLevel(root3, i);
        //     System.out.println();
        // }
    }
}
