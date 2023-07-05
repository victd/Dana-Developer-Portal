

// Spicer drivetrain products API
// Dana Aftermarket, precision tooling and aftermarket parts
// Dana Developer Portal 
// contact and register your email for access to the API
// the minimum base version of PTT gets update every now and then, 2.8.150
// JPro makers of Noregon obd software
// Detroit Diesel needs engine regen
// automate workflow for the paths of diagnostics, needing a lot of mechanical hands on experience
// quiero, ensaneme como lavarme las manos, trillium park, roller, boulevard, el sazon tia flor, plug leak, then patch from interior

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



