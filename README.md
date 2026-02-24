<body>
  <div>
  <h1> ♾️ Reverse Linked List Detalied Explanation</h1>
  <p> Given the head of a singly linked list reverse the list such that the last node becomes the first node and all links are reversed</p>
  </div>
  <div>
    <h1> 🎯 Objective</h1>
    <ul>
      <li>Instead creating a new list ..we reverse the list in-place by mainuplating node reference <br> ➡️This approach ensure :</li>
      <ul>
        <li> Efficient traversal</li>
        <li> no extra space allocation </li>
        <li> Clean pointer managment</li>
      </ul>
    </ul>
  </div>
  <div>
    <ul>
      <li>To reverse the list we use three pointers :</li>
    <ul>
      <li> prev</li>
      <li>curr</li>
      <li>next</li>
    </ul>
    </ul>
    <p> We iterate through the list an dreverse the link og reach node one by one</p>
  </div>
  <div>
    <h1> ⚙️Algorithm Steps</h1>
    <ol>
      <li>Initialise :</li>
      <ul>
        <li>prev=null</li>
        <li>curr=head</li>
      </ul>
      <li> Traverse the list until <b><mark> curr!=null</mark></b></li>
      <li>Store next node -> <b><mark> next=curr.next</mark></b></li>
      <li>Reverse pointer -> <b><mark> curr.next=prev</mark></b></li>
      <li> Move pointers forward :</li>
      <ul>
        <li>prev=curr</li>
        <li>curr=next</li>
      </ul>
      <li> After loop ends-> head=prev</li>
    </ol>
  </div>
</body>
