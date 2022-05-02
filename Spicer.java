

// Spicer drivetrain products API
// Dana Aftermarket
// Dana Developer Portal 

package dana;

import java.io.Serializable;

public class Spicer implements Serializable, Comparable<Novel> {
    static final long serialVersionUID = 1L;
    private String author;
    private String title;
    private int id;

    public Spicer() { }

    public void setAuthor(final String author) { this.author = author; }
    public String getAuthor() { return this.author; }
    public void setTitle(final String title) { this.title = title; }
    public String getTitle() { return this.title; }
    public void setId(final int id) { this.id = id; }
    public int getId() { return this.id; }

    public int compareTo(final Spicer other) { return this.id - other.id; }
}



