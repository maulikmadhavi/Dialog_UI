package xyz.hiroshifuu.speechapp.models;

import xyz.hiroshifuu.speechapp.models.IUser;

import java.util.Date;

/**
 * For implementing by real message model
 */
public interface IMessage {

    /**
     * Returns message identifier
     *
     * @return the message id
     */
    String getId();

    /**
     * Returns message text
     *
     * @return the message text
     */
    String getText();

    /**
     * Returns message author. See the {@link IUser} for more details
     *
     * @return the message author
     */
    IUser getUser();

    /**
     * Returns message creation date
     *
     * @return the message creation date
     */
    Date getCreatedAt();

    String getLink();
}
