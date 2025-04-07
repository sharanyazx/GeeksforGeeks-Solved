<h2><a href="https://www.geeksforgeeks.org/problems/cycle-race3338/1?page=1&category=Game%20Theory&sortBy=submissions">Discovering Atlantis</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Jack and Jelly are on the ship en route to discover Atlantis and decide to play a game. The distance between their starting point and the city of Atlantis is N kilometers. They take turns manning the ship and each of them can steer the ship for 1, 2, or 4 kilometers in one turn. This should never exceed the remaining distance. The captain who is in charge of the ship when they reach Atlantis wins the game.<br>If Jelly starts as the captain in charge of the ship, find who wins the game, i.e., who will be in charge of the ship when they reach Atlantis given both Jack and Jelly play optimally.</span></p>
<p><br><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 2
<strong>Output:</strong> JELLY
<strong>Explaination:</strong> Jelly can cover 2 Km 
in his first turn itself.</span></pre>
<p><br><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> N = 3
<strong>Output:</strong> JACK
<strong>Explaination:</strong> On his first turn Jelly can 
cover either 1 or 2km. In either case, Jack 
will cover the remaining distance in his turn.</span></pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You do not need to read input or print anything. Your task is to complete the function <strong>captain() </strong>which takes the N as the input parameter and returns a string ("JACK" or "JELLY") denoting the name of the final captain.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(1)<br><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N ≤ 10<sup>7</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Game Theory</code>&nbsp;