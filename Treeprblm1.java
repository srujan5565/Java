class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left=right=null;
    }
}
class Btree{

    Node toTree(Node root,int[] arr,int index){
        if(index<arr.length){
            Node temp=new Node(arr[index]);
            root=temp;
            root.left=toTree(root.left, arr, 2*index+1);
            root.right=toTree(root.right, arr, 2*index+2);
        }
        return root;
    }

    // public boolean findBST(Node root){
    //     if(root!=null){
    //         if(root.left!=null && root.left.data>root.data)
    //         return false;
    //         if(root.right!=null && root.right.data<root.data)
    //         return false;
    //         if(root.left!=null)
    //         findBST(root.left);
    //         if(root.right!=null)
    //         findBST(root.right);
    //     }
    //     else
    //     return true;
    // }

    public boolean findBST(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<min || root.data>max) return false;
        return findBST(root.left,min,root.data) && findBST(root.right,root.data,max);
    }

    public void pathFromRootToLeaf(Node root,int leaf){
        if(root!=null){
        System.out.println(root.data+" ");
        if(root.data!=leaf){
            if(leaf<root.data)
            {
                pathFromRootToLeaf(root.left, leaf);
            }
            else
            {
                pathFromRootToLeaf(root.right, leaf);
            }
        }
    }
    }

    void Heapify(int index,int arr[]){
        while(index<arr.length){
            int leftIndex=2*index+1;
            int rightIndex=2*index+2;
            if(arr[index]>arr[leftIndex]){
                int tem=arr[index];
                arr[index]=arr[leftIndex];
                arr[leftIndex]=tem;
            }
            if(arr[index]>arr[rightIndex]){
                int tem=arr[index];
                arr[index]=arr[rightIndex];
                arr[rightIndex]=tem;
            }
        }
    }
}
public class Treeprblm1 {
    public static void main(String[] args) {
        int arr[]={5,3,9,2,4,7,10};
        Btree btree = new Btree();
        Node root=null;
        root=btree.toTree(root,arr,0);
        // System.out.println(btree.findBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        if(btree.findBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
        btree.pathFromRootToLeaf(root,10 );
    }
}
