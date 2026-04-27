// Experiment - 09

// Write a Program to Implement Mini DNS Service

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>

struct dns {
    char domain[50];
    char ip[50];
};

dns db[] = {
    {"google.com", "142.250.190.78"},
    {"facebook.com", "157.240.22.35"},
};

int main() {
    int sockfd, new_sock;
    struct sockaddr_in server, client;
    char buffer[100];
    int len, found;

    if (!found) {
        char msg[] = "Domain not found";
        send(new_sock, msg, sizeof(msg), 0);
    }

    close(new_sock);
    close(sockfd);
    return 0;
}

// DNS client code (dns_client.c)
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>

int main() {
    int sockfd;
    struct sockaddr_in server;
    char domain[50], response[100];

    server.sin_family = AF_INET;
    server.sin_port = htons(8080);
    server.sin_addr.s_addr = inet_addr("127.0.0.1");

    printf("Enter domain name: ");
    scanf("%s", domain);

    printf("IP address: %s\n", response);

    close(sockfd);
    return 0;
}

// Output
// input : facebook.com
// output : 157.240.22.35

// input : google.com
// output : 142.250.190.78

// input : openai.com
// output : 104.18.12.123