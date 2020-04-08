package cl.ucn.disc.dsm.DaDichatdisc.service.resultado;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dsm.DaDichatdisc.model.ConversacionReply;
import cl.ucn.disc.dsm.DaDichatdisc.model.Usuario;

public class Almacenado {

    public Integer conversationId;
    public List<Usuario> users = new ArrayList<Usuario>();
    public String createdAt;
    public List<ConversacionReply> messages = new ArrayList<ConversacionReply>();
}
