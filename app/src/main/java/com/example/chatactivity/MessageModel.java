package com.example.chatactivity;

public class MessageModel
{
    private String messageId;
    private String senderId;
    private String message;
    private Long timestamp;

    public MessageModel()
    {
    }
    public MessageModel(String messageId, String senderId, String message, Long timestamp)
    {
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.timestamp = timestamp;
    }


    public String getMessageId()
    {
        return messageId;
    }

    public String getMessage()
    {
        return message;
    }

    public String getSenderId()
    {
        return senderId;
    }
    public Long getTimestamp()
    {
        return timestamp;
    }

    public void setMessageId(String messageId)
    {
        this.messageId = messageId;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setSenderId(String senderId)
    {
        this.senderId = senderId;
    }
    public void setTimestamp(Long timestamp)
    {
        this.timestamp = timestamp;
    }
}
