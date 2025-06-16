<?PHP

class ListNode {
    public $data = NULL;
    public $next = NULL;

    public function __construct($data = NULL) {
    $this->data = $data;
    }
}

class LinkedList {
    private $firstNode = NULL;

    public function insert($data){
        $newNode  = new ListNode($data);

        if($this->firstNode == NULL){
            $this->firstNode = $newNode;
        }else{
            $currentNode = $this->firstNode;

            while($currentNode -> next !== NULL){
                $currentNode = $currentNode -> next;
            }
            $currentNode -> insert($newNode);
        }
    }

    public function traverse(){
        $currentNode = $this->firstNode;
        while($currentNode !== NULL) {
            echo $currentNode->data. "\n";
            $currentNode = $currentNode -> next;
        }
    }
} 


       
       
?>