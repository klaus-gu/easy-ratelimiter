package xyz.turboklaus.easyratelimiter;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ratelimiter
 **/
public class TimestampHolder {
    private long timestamp;

    public TimestampHolder() {
        this(System.currentTimeMillis());
    }

    public TimestampHolder(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
