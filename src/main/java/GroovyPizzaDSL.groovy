/**
 * @Author fandayong
 * @Date 2021/2/3 9:21 PM
 * @description
 */
def large = 'large'
def thin = 'thin'
def visa = 'Visa'
def Olives = 'Olives'
def Onions = 'Onions'
def Bell_pepper = 'Bell Pepper'

orderInfo = [:]

def methodMissiing(String name,args){
    orderInfo[name] = args
}

