---


---

<h1 id="se465-finalproject">SE465-finalproject</h1>
<h2 id="instructions">Instructions</h2>
<ul>
<li>
<p>Run these two commands to get a /target directory</p>
</li>
<li>
<p>Once created, execute the .jar<br>
<code>$ java -jar /path/to/events-api/target/events-api-0.0.1-SNAPSHOT-jar-with-dependencies</code></p>
</li>
<li>
<p>Navigate to <code>localhost:8080</code> and try sending GET requests to</p>
<ul>
<li><code>/events</code></li>
<li><code>/event?uid=&lt;a uid&gt;</code></li>
<li>Or send a POST to
<ul>
<li><code>/subscribe</code></li>
<li>body of <code>application/json</code></li>
</ul>
</li>
</ul>
<pre><code>	{
	    "uid":"4188870",
	    "email":"format@Like_this.com",
	    "reminder": 
	    {
	       "unit":"MS",
	        "value":0
	    }
	}
</code></pre>
<ul>
<li>The email sending function could not work in time, though the object is created and ready to send emails within the web-service</li>
</ul>
</li>
</ul>
<blockquote>
<p>Written with <a href="https://stackedit.io/">StackEdit</a>.</p>
</blockquote>

