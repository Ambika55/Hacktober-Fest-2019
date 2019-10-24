def sum_all(input_list):
    return sum(range(min(input_list), max(input_list)+1))


if __name__ == "__main__":
    print(sum_all([1,4]))
    print(sum_all([4,1]))
