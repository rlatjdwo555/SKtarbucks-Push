
package local;

public class PushSent extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String msg;
    private Date sendTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSendTime(Date sendTime){
        this.sendTime = sendTime;
    }

    public Date getSendTime(){
        return snedTime;
    }
}
