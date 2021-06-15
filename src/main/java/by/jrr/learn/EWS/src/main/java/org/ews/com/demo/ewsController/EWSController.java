package org.ews.com.demo.ewsController;

import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.service.folder.Folder;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.ItemId;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.ItemView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EWSController {
    ExchangeService exchangeService = new ExchangeService();

    public Collection<EmailMessage> getMessage() throws Exception {
        exchangeService.setCredentials(new WebCredentials("severstal\\ouz.1632235", "12Reliability!34"));
        exchangeService.setUrl(new URI("mail.severstalgroup.com"));
        exchangeService.setTraceEnabled(true);
        exchangeService.setPreAuthenticate(false);
        ItemView itemView = new ItemView(1);

        Folder folder = Folder.bind(exchangeService, WellKnownFolderName.Inbox);
        FindItemsResults<Item> results = exchangeService.findItems(folder.getId(), itemView);
        List<EmailMessage> emailList = new ArrayList<>();
        for (Item itemObj: results
        ) {
            emailList.add(readEmailItem(itemObj.getId()));
        }
        exchangeService.close();
        return emailList;
    }

    private EmailMessage readEmailItem(ItemId id) throws Exception {
        Item itemObj = Item.bind(exchangeService,id, PropertySet.FirstClassProperties);
        return EmailMessage.bind(exchangeService, itemObj.getId());
    }
}
