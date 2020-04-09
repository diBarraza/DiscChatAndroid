package cl.ucn.disc.dsm.DaDichatdisc.service;

import java.util.List;

import cl.ucn.disc.dsm.DaDichatdisc.model.Conversacion;
import cl.ucn.disc.dsm.DaDichatdisc.model.ConversacionReply;
import cl.ucn.disc.dsm.DaDichatdisc.model.Usuario;

public interface Servicio {

    /**
     * Authenticate the user, get the API token.
     *
     * @param mail User mail
     * @param password User password
     * @return An API token
     */
    String getApiToken(String mail, String password);

    /**
     * Get the list of registered users.
     *
     * @return List of Users
     */
    List<Usuario> getRegisteredUsers();

    /**
     * Get user's conversations.
     *
     * @param apiToken The user api token
     * @return List of conversations
     */
    List<Conversacion> getConversations(String apiToken);

    /**
     * Creates a new conversation.
     *
     * @param apiToken    The user api token
     * @param recipientId The id of the receiver user of the conversation.
     * @return id of the conversation.
     */
    int setNewConversation(String apiToken, int recipientId);


    /**
     * Add a new message to the conversation.
     *
     * @param apiToken          The user API token.
     * @param conversationId    The conversation id.
     * @param content           The content of the message.
     * @param latitude          Latitude localization component.
     * @param longitude         Longitude localization component.
     * @param localizationError Localization error.
     * @return The created Message.
     */
    ConversacionReply sendMessage(String apiToken, int conversationId, String content,
                                    String latitude, String longitude, String localizationError);
}
