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
    <h1> ⚙️Working Mechanism (Pointer Movement Visualization)</h1>
    <ol>
      <li>Initialise List:</li>
      <ul>
        <li> 1->2->3->4->5->null</li>
        <li>We maintain three pointers :</li>
        <li>prev-> tracks reversed portion</li>
        <li>curr->Curent node being processed</li>
        <li>next->Store next node temporarily</li>
      </ul>
    </div>
    <div>
      <h1>Step Flow </h1>
      <ul>
        <li> Save next node</li>
        <li>Reverse current node pointer</li>
        <li>Move prev forward</li>
      </ul>
    </div>
</body>
