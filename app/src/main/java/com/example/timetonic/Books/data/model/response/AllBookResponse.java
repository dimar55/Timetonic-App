package com.example.timetonic.Books.data.model.response;


import java.util.List;

public class AllBookResponse {
    private String status;
    private long sstamp;
    private AllBooks allBooks;
    private String createdVNB;
    private String req;

    // Getters y setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getSstamp() {
        return sstamp;
    }

    public void setSstamp(long sstamp) {
        this.sstamp = sstamp;
    }

    public AllBooks getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(AllBooks allBooks) {
        this.allBooks = allBooks;
    }

    public String getCreatedVNB() {
        return createdVNB;
    }

    public void setCreatedVNB(String createdVNB) {
        this.createdVNB = createdVNB;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }


    public class AllBooks {
        private int nbBooks;
        private int nbContacts;
        private List<Object> contacts;
        private List<Book> books;

        // Getters y setters

        public int getNbBooks() {
            return nbBooks;
        }

        public void setNbBooks(int nbBooks) {
            this.nbBooks = nbBooks;
        }

        public int getNbContacts() {
            return nbContacts;
        }

        public void setNbContacts(int nbContacts) {
            this.nbContacts = nbContacts;
        }

        public List<Object> getContacts() {
            return contacts;
        }

        public void setContacts(List<Object> contacts) {
            this.contacts = contacts;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }
    }

    public class Book {
        private boolean accepted;
        private boolean archived;
        private long sstamp;
        private boolean del;
        private String b_c;
        private String b_o;
        private String contact_u_c;
        private int nbNotRead;
        private int nbMembers;
        private List<Member> members;
        private FpForm fpForm;
        private LastMsg lastMsg;
        private UserPrefs userPrefs;
        private OwnerPrefs ownerPrefs;
        private int sbid;
        private int lastMsgRead;
        private int lastMedia;
        private boolean favorite;
        private int order;

        // Getters y setters

        public boolean isAccepted() {
            return accepted;
        }

        public void setAccepted(boolean accepted) {
            this.accepted = accepted;
        }

        public boolean isArchived() {
            return archived;
        }

        public void setArchived(boolean archived) {
            this.archived = archived;
        }

        public long getSstamp() {
            return sstamp;
        }

        public void setSstamp(long sstamp) {
            this.sstamp = sstamp;
        }

        public boolean isDel() {
            return del;
        }

        public void setDel(boolean del) {
            this.del = del;
        }

        public String getB_c() {
            return b_c;
        }

        public void setB_c(String b_c) {
            this.b_c = b_c;
        }

        public String getB_o() {
            return b_o;
        }

        public void setB_o(String b_o) {
            this.b_o = b_o;
        }

        public String getContact_u_c() {
            return contact_u_c;
        }

        public void setContact_u_c(String contact_u_c) {
            this.contact_u_c = contact_u_c;
        }

        public int getNbNotRead() {
            return nbNotRead;
        }

        public void setNbNotRead(int nbNotRead) {
            this.nbNotRead = nbNotRead;
        }

        public int getNbMembers() {
            return nbMembers;
        }

        public void setNbMembers(int nbMembers) {
            this.nbMembers = nbMembers;
        }

        public List<Member> getMembers() {
            return members;
        }

        public void setMembers(List<Member> members) {
            this.members = members;
        }

        public FpForm getFpForm() {
            return fpForm;
        }

        public void setFpForm(FpForm fpForm) {
            this.fpForm = fpForm;
        }

        public LastMsg getLastMsg() {
            return lastMsg;
        }

        public void setLastMsg(LastMsg lastMsg) {
            this.lastMsg = lastMsg;
        }

        public UserPrefs getUserPrefs() {
            return userPrefs;
        }

        public void setUserPrefs(UserPrefs userPrefs) {
            this.userPrefs = userPrefs;
        }

        public OwnerPrefs getOwnerPrefs() {
            return ownerPrefs;
        }

        public void setOwnerPrefs(OwnerPrefs ownerPrefs) {
            this.ownerPrefs = ownerPrefs;
        }

        public int getSbid() {
            return sbid;
        }

        public void setSbid(int sbid) {
            this.sbid = sbid;
        }

        public int getLastMsgRead() {
            return lastMsgRead;
        }

        public void setLastMsgRead(int lastMsgRead) {
            this.lastMsgRead = lastMsgRead;
        }

        public int getLastMedia() {
            return lastMedia;
        }

        public void setLastMedia(int lastMedia) {
            this.lastMedia = lastMedia;
        }

        public boolean isFavorite() {
            return favorite;
        }

        public void setFavorite(boolean favorite) {
            this.favorite = favorite;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        // Asegúrate de tener getters y setters para todas las propiedades
    }

    public class OwnerPrefs {
        private String oCoverColor;
        private boolean oCoverUseLastImg;
        private String oCoverImg;
        private String oCoverType;
        private boolean authorizeMemberBroadcast;
        private boolean acceptExternalMsg;
        private String title;
        private boolean notifyMobileConfidential;



        public String getoCoverColor() {
            return oCoverColor;
        }

        public void setoCoverColor(String oCoverColor) {
            this.oCoverColor = oCoverColor;
        }

        public boolean isoCoverUseLastImg() {
            return oCoverUseLastImg;
        }

        public void setoCoverUseLastImg(boolean oCoverUseLastImg) {
            this.oCoverUseLastImg = oCoverUseLastImg;
        }

        public String getoCoverImg() {
            return oCoverImg;
        }

        public void setoCoverImg(String oCoverImg) {
            this.oCoverImg = oCoverImg;
        }

        public String getoCoverType() {
            return oCoverType;
        }

        public void setoCoverType(String oCoverType) {
            this.oCoverType = oCoverType;
        }

        public boolean isAuthorizeMemberBroadcast() {
            return authorizeMemberBroadcast;
        }

        public void setAuthorizeMemberBroadcast(boolean authorizeMemberBroadcast) {
            this.authorizeMemberBroadcast = authorizeMemberBroadcast;
        }

        public boolean isAcceptExternalMsg() {
            return acceptExternalMsg;
        }

        public void setAcceptExternalMsg(boolean acceptExternalMsg) {
            this.acceptExternalMsg = acceptExternalMsg;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isNotifyMobileConfidential() {
            return notifyMobileConfidential;
        }

        public void setNotifyMobileConfidential(boolean notifyMobileConfidential) {
            this.notifyMobileConfidential = notifyMobileConfidential;
        }
    }

    public class Member {
        private String u_c;
        private String invite;
        private int right;


    }

    public class FpForm {
        private int sfpid;
        private String name;
        private long lastModified;


    }

    public class LastMsg {
        private int smid;
        private String uuid;
        private long sstamp;
        private int lastCommentId;
        private String msgBody;
        private String msgBodyHtml;
        private String msgType;
        private String msgMethod;
        private String msgColor;
        private int nbComments;
        private int pid;
        private int nbMedias;
        private int nbEmailCids;
        private int nbDocs;
        private String b_c;
        private String b_o;
        private String u_c;
        private String msg;
        private boolean del;
        private long created;
        private long lastModified;
        private List<Media> medias;


    }

    public class Media {
        private int id;
        private String ext;
        private String originName;
        private String internName;
        private int size;
        private String type;
        private String emailCid;
        private boolean del;


    }

    public class UserPrefs {
        private int maxMsgsOffline;
        private boolean syncWithHubic;
        private boolean uCoverLetOwnerDecide;
        private String uCoverColor;
        private boolean uCoverUseLastImg;
        private String uCoverImg;
        private String uCoverType;
        private boolean inGlobalSearch;
        private boolean inGlobalTasks;
        private boolean notifyEmailCopy;
        private boolean notifySmsCopy;
        private boolean notifyMobile;
        private boolean notifyWhenMsgInArchivedBook;


    }
}